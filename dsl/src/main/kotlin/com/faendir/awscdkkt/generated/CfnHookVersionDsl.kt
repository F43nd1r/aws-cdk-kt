package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnHookVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookVersion(id: String, props: CfnHookVersionProps): CfnHookVersion =
    CfnHookVersion(this, id, props)

@Generated
public fun Construct.cfnHookVersion(
  id: String,
  props: CfnHookVersionProps,
  initializer: @AwsCdkDsl CfnHookVersion.() -> Unit,
): CfnHookVersion = CfnHookVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHookVersion(id: String, initializer: @AwsCdkDsl
    CfnHookVersion.Builder.() -> Unit): CfnHookVersion = CfnHookVersion.Builder.create(this,
    id).apply(initializer).build()
