package com.faendir.awscdkkt.generated.services.ssmquicksetup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmquicksetup.CfnLifecycleAutomation
import software.amazon.awscdk.services.ssmquicksetup.CfnLifecycleAutomationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLifecycleAutomation(
  id: String,
  props: CfnLifecycleAutomationProps,
  initializer: @AwsCdkDsl CfnLifecycleAutomation.() -> Unit = {},
): CfnLifecycleAutomation = CfnLifecycleAutomation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLifecycleAutomation(id: String, initializer: @AwsCdkDsl CfnLifecycleAutomation.Builder.() -> Unit = {}): CfnLifecycleAutomation = CfnLifecycleAutomation.Builder.create(this, id).apply(initializer).build()
