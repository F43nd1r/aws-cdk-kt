package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceProfile(
  id: String,
  props: CfnInstanceProfileProps,
  initializer: @AwsCdkDsl CfnInstanceProfile.() -> Unit = {},
): CfnInstanceProfile = CfnInstanceProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceProfile(id: String, initializer: @AwsCdkDsl
    CfnInstanceProfile.Builder.() -> Unit = {}): CfnInstanceProfile =
    CfnInstanceProfile.Builder.create(this, id).apply(initializer).build()
