package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnSAMLProvider
import software.amazon.awscdk.services.iam.CfnSAMLProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSAMLProvider(id: String, initializer: @AwsCdkDsl CfnSAMLProvider.() -> Unit
    = {}): CfnSAMLProvider = CfnSAMLProvider(this, id).apply(initializer)

@Generated
public fun Construct.cfnSAMLProvider(
  id: String,
  props: CfnSAMLProviderProps,
  initializer: @AwsCdkDsl CfnSAMLProvider.() -> Unit = {},
): CfnSAMLProvider = CfnSAMLProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSAMLProvider(id: String, initializer: @AwsCdkDsl
    CfnSAMLProvider.Builder.() -> Unit = {}): CfnSAMLProvider = CfnSAMLProvider.Builder.create(this,
    id).apply(initializer).build()
