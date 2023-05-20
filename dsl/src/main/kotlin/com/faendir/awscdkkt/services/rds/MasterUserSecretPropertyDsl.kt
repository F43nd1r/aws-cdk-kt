@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

public
    fun masterUserSecretProperty(initializer: CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit):
    CfnDBInstance.MasterUserSecretProperty =
    CfnDBInstance.MasterUserSecretProperty.builder().apply(initializer).build()
