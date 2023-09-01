package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public fun buildMasterUserSecretProperty(initializer: @AwsCdkDsl
    CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit = {}):
    CfnDBInstance.MasterUserSecretProperty =
    CfnDBInstance.MasterUserSecretProperty.Builder().apply(initializer).build()
