package be.intecbrussel.entities;

public class Campaign implements Entity{

    private int campaignId;
    private String campaignName;
    private int discount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Campaign() {
    }

    public Campaign(int campaignId, String campaignName, int discount, LocalDate startDate, LocalDate endDate) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public Campaign setCampaignId(int campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public Campaign setCampaignName(String campaignName) {
        this.campaignName = campaignName;
        return this;
    }

    public int getDiscount() {
        return discount;
    }

    public Campaign setDiscount(int discount) {
        this.discount = discount;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Campaign setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Campaign setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
}
