package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnResourceDefaultVersion
import software.amazon.awscdk.CfnResourceDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDefaultVersion(id: String, initializer: @AwsCdkDsl
    CfnResourceDefaultVersion.() -> Unit = {}): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnResourceDefaultVersion(
  id: String,
  props: CfnResourceDefaultVersionProps,
  initializer: @AwsCdkDsl CfnResourceDefaultVersion.() -> Unit = {},
): CfnResourceDefaultVersion = CfnResourceDefaultVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceDefaultVersion(id: String, initializer: @AwsCdkDsl
    CfnResourceDefaultVersion.Builder.() -> Unit = {}): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion.Builder.create(this, id).apply(initializer).build()
