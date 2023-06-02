package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityPoolPrincipalTag(id: String,
    props: CfnIdentityPoolPrincipalTagProps): CfnIdentityPoolPrincipalTag =
    CfnIdentityPoolPrincipalTag(this, id, props)

@Generated
public fun Construct.cfnIdentityPoolPrincipalTag(
  id: String,
  props: CfnIdentityPoolPrincipalTagProps,
  initializer: @AwsCdkDsl CfnIdentityPoolPrincipalTag.() -> Unit,
): CfnIdentityPoolPrincipalTag = CfnIdentityPoolPrincipalTag(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentityPoolPrincipalTag(id: String, initializer: @AwsCdkDsl
    CfnIdentityPoolPrincipalTag.Builder.() -> Unit): CfnIdentityPoolPrincipalTag =
    CfnIdentityPoolPrincipalTag.Builder.create(this, id).apply(initializer).build()
