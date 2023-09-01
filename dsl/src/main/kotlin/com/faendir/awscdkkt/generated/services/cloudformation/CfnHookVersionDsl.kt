package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnHookVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookVersion(
  id: String,
  props: CfnHookVersionProps,
  initializer: @AwsCdkDsl CfnHookVersion.() -> Unit = {},
): CfnHookVersion = CfnHookVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHookVersion(id: String, initializer: @AwsCdkDsl
    CfnHookVersion.Builder.() -> Unit = {}): CfnHookVersion = CfnHookVersion.Builder.create(this,
    id).apply(initializer).build()
