package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBClusterProps

@Generated
public fun cfnDBClusterProps(initializer: CfnDBClusterProps.Builder.() -> Unit = {}):
    CfnDBClusterProps = CfnDBClusterProps.builder().apply(initializer).build()
