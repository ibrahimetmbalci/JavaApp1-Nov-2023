package org.csystem.app.earthquake.data.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@Builder
@ToString
public class EarthquakeCountryInfo {
    public long id;
    public String distance;
    public String countryCode;
    public String countryName;

    public long regionInfoId;
}
