package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnSecurityProfile
import software.amazon.awscdk.services.connect.CfnSecurityProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityProfile(
  id: String,
  props: CfnSecurityProfileProps,
  initializer: @AwsCdkDsl CfnSecurityProfile.() -> Unit = {},
): CfnSecurityProfile = CfnSecurityProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityProfile(id: String, initializer: @AwsCdkDsl
    CfnSecurityProfile.Builder.() -> Unit = {}): CfnSecurityProfile =
    CfnSecurityProfile.Builder.create(this, id).apply(initializer).build()
