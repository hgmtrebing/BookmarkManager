package us.hgmtrebing.bookmarkmanager;

import java.util.HashSet;
import java.util.Set;

public class TagManager {

  private final Tag userRoot;
  private Set<Tag> tags;

  public TagManager() {
    this.userRoot = new Tag("USER_ROOT", "USER_ROOT", null);
    this.tags = new HashSet<>();
  }

  public class Tag {

    private Tag parent;
    private Set<Tag> children;
    private String name;
    private String description;
    // TODO - Add Color
    // TODO - Add Icon
    // TODO - Add User
    // TODO - Add Bookmarks

    public Tag(String name, String description, Tag parent) {
      this.name = name;
      this.description = description;
      this.parent = parent;
      this.children = new HashSet<>();
    }

    public Tag(String name, String description) {
      this(name, description, userRoot);
    }

    @Override
    public int hashCode() {
      return this.name.hashCode();
    }
  }

}
