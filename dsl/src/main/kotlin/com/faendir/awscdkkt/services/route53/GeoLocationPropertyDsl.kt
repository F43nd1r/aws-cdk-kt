package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

@Generated
public fun geoLocationProperty(initializer: CfnRecordSetGroup.GeoLocationProperty.Builder.() -> Unit
    = {}): CfnRecordSetGroup.GeoLocationProperty =
    CfnRecordSetGroup.GeoLocationProperty.builder().apply(initializer).build()
