package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.SubnetGroupProps

@Generated
public fun subnetGroupProps(initializer: SubnetGroupProps.Builder.() -> Unit = {}): SubnetGroupProps
    = SubnetGroupProps.builder().apply(initializer).build()
