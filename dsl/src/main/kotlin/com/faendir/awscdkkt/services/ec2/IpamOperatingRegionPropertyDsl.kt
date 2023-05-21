package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery

@Generated
public
    fun ipamOperatingRegionProperty(initializer: CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.Builder.() -> Unit
    = {}): CfnIPAMResourceDiscovery.IpamOperatingRegionProperty =
    CfnIPAMResourceDiscovery.IpamOperatingRegionProperty.builder().apply(initializer).build()
