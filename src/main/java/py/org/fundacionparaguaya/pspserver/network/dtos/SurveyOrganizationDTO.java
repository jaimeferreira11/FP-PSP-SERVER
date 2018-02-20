package py.org.fundacionparaguaya.pspserver.network.dtos;

import com.google.common.base.MoreObjects;

import py.org.fundacionparaguaya.pspserver.surveys.dtos.SurveyDefinition;

public class SurveyOrganizationDTO {

    private Long id;

    private SurveyDefinition survey;

    private OrganizationDTO organization;

    public SurveyOrganizationDTO(){};

    private SurveyOrganizationDTO(Long id, SurveyDefinition survey,
            OrganizationDTO organization) {
        this.id = id;
        this.survey = survey;
        this.organization = organization;
    }

    public static class Builder {

        private Long surveyOrganizationid;
        private SurveyDefinition survey;
        private OrganizationDTO organization;

        public Builder surveyOrganizationId(Long surveyOrganizationid) {
            this.surveyOrganizationid = surveyOrganizationid;
            return this;
        }

        public Builder survey(SurveyDefinition survey) {
            this.survey = survey;
            return this;
        }

        public Builder organization(OrganizationDTO organization) {
            this.organization = organization;
            return this;
        }

        public SurveyOrganizationDTO build() {
            return new SurveyOrganizationDTO(surveyOrganizationid, survey,
                    organization);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SurveyDefinition getSurvey() {
        return survey;
    }

    public void setSurvey(SurveyDefinition survey) {
        this.survey = survey;
    }

    public OrganizationDTO getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationDTO organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id)
                .add("survey", survey).add("organization", organization)
                .toString();
    }

}