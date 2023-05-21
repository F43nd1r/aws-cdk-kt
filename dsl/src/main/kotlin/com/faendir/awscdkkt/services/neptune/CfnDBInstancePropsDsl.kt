package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBInstanceProps

@Generated
public fun cfnDBInstanceProps(initializer: CfnDBInstanceProps.Builder.() -> Unit = {}):
    CfnDBInstanceProps = CfnDBInstanceProps.builder().apply(initializer).build()
