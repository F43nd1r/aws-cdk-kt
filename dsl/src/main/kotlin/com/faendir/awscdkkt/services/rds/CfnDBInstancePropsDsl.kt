package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstanceProps

@Generated
public fun cfnDBInstanceProps(initializer: CfnDBInstanceProps.Builder.() -> Unit = {}):
    CfnDBInstanceProps = CfnDBInstanceProps.builder().apply(initializer).build()
