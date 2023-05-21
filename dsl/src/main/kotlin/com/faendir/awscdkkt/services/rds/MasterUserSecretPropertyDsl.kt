package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public
    fun masterUserSecretProperty(initializer: CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit
    = {}): CfnDBInstance.MasterUserSecretProperty =
    CfnDBInstance.MasterUserSecretProperty.builder().apply(initializer).build()
