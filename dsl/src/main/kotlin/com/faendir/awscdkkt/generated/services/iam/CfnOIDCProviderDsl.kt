package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.amazon.awscdk.services.iam.CfnOIDCProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOIDCProvider(
  id: String,
  props: CfnOIDCProviderProps,
  initializer: @AwsCdkDsl CfnOIDCProvider.() -> Unit = {},
): CfnOIDCProvider = CfnOIDCProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOIDCProvider(id: String, initializer: @AwsCdkDsl
    CfnOIDCProvider.Builder.() -> Unit = {}): CfnOIDCProvider = CfnOIDCProvider.Builder.create(this,
    id).apply(initializer).build()
