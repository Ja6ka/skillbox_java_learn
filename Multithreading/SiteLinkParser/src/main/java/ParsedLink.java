public class ParsedLink {

    private String parentLink;
    private Integer linkIdentifier;

    public ParsedLink(String parentLink, Integer linkIdentifier) {
        this.parentLink = parentLink;
        this.linkIdentifier = linkIdentifier;
    }

    public String getParentLink() {
        return parentLink;
    }

    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    public Integer getLinkIdentifier() {
        return linkIdentifier;
    }

    public void setLinkIdentifier(Integer linkIdentifier) {
        this.linkIdentifier = linkIdentifier;
    }
}
