# import os

# def generate_md_index(directory, md_file):
#     """
#     Generates a Markdown file with an index of files and a directory tree.

#     Parameters:
#     - directory: The path to the directory to scan.
#     - md_file: The path to the Markdown file to generate.
#     """

#     # Get the current working directory
#     current_directory = os.getcwd()

#     # Construct the full path to the directory to scan
#     full_directory_path = os.path.join(current_directory, directory)

#     # Initialize the content of the Markdown file
#     content = "# Directory Index\n\n"

#     # Function to recursively add files and subdirectories to the content
#     def add_files(path, level=0):
#         nonlocal content  # Declare 'content' as nonlocal to allow modification
#         entries = os.listdir(path)
#         for entry in entries:
#             full_path = os.path.join(path, entry)
#             if os.path.isdir(full_path):
#                 content += "  " * level + "- [{}]".format(entry) + "\n"
#                 add_files(full_path, level + 1)
#             else:
#                 content += "  " * level + "- [{}]".format(entry) + "\n"

#     # Start scanning from the given directory
#     try:
#         add_files(full_directory_path)
#     except Exception as e:
#         print(f"An error occurred while generating the index: {e}")

#     # Construct the full path to the Markdown file to generate
#     full_md_file_path = os.path.join(current_directory, md_file)

#     # Write the content to the Markdown file
#     with open(full_md_file_path, 'w') as f:
#         f.write(content)

# # Example usage
# directory_to_scan = '.'  # Scan the current directory
# markdown_file = 'index.md'  # Generate the MD file in the current directory

# generate_md_index(directory_to_scan, markdown_file)
# print(f"Markdown file generated at {markdown_file}")


import os

def generate_md_index(directory, md_file):
    """
    Generates a Markdown file with an index of files and a directory tree,
    excluding files that start with a dot (.) for Unix-like systems.
    """

    # Get the current working directory
    current_directory = os.getcwd()

    # Construct the full path to the directory to scan
    full_directory_path = os.path.join(current_directory, directory)

    # Initialize the content of the Markdown file
    content = "# Directory Index\n\n"

    # Function to recursively add files and subdirectories to the content
    def add_files(path, level=0):
        nonlocal content  # Declare 'content' as nonlocal to allow modification
        entries = os.listdir(path)
        for entry in entries:
            full_path = os.path.join(path, entry)
            # Skip files starting with a dot
            if entry.startswith('.'):
                continue
            if os.path.isdir(full_path):
                content += "  " * level + "- [{}]".format(entry) + "\n"
                add_files(full_path, level + 1)
            else:
                content += "  " * level + "- [{}]".format(entry) + "\n"

    # Start scanning from the given directory
    try:
        add_files(full_directory_path)
    except Exception as e:
        print(f"An error occurred while generating the index: {e}")

    # Construct the full path to the Markdown file to generate
    full_md_file_path = os.path.join(current_directory, md_file)

    # Write the content to the Markdown file
    with open(full_md_file_path, 'w') as f:
        f.write(content)

# Example usage
directory_to_scan = '.'  # Scan the current directory
markdown_file = 'index.md'  # Generate the MD file in the current directory

generate_md_index(directory_to_scan, markdown_file)
print(f"Markdown file generated at {markdown_file}")