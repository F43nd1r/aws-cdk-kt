package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookDefaultVersion(id: String, initializer: @AwsCdkDsl CfnHookDefaultVersion.() -> Unit = {}): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnHookDefaultVersion(
  id: String,
  props: CfnHookDefaultVersionProps,
  initializer: @AwsCdkDsl CfnHookDefaultVersion.() -> Unit = {},
): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHookDefaultVersion(id: String, initializer: @AwsCdkDsl CfnHookDefaultVersion.Builder.() -> Unit = {}): CfnHookDefaultVersion = CfnHookDefaultVersion.Builder.create(this, id).apply(initializer).build()
