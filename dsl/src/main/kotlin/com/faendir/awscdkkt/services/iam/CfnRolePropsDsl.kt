package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnRoleProps

@Generated
public fun cfnRoleProps(initializer: CfnRoleProps.Builder.() -> Unit = {}): CfnRoleProps =
    CfnRoleProps.builder().apply(initializer).build()
