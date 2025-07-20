package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnDataAutomationProject
import software.amazon.awscdk.services.bedrock.CfnDataAutomationProjectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataAutomationProject(
  id: String,
  props: CfnDataAutomationProjectProps,
  initializer: @AwsCdkDsl CfnDataAutomationProject.() -> Unit = {},
): CfnDataAutomationProject = CfnDataAutomationProject(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataAutomationProject(id: String, initializer: @AwsCdkDsl CfnDataAutomationProject.Builder.() -> Unit = {}): CfnDataAutomationProject = CfnDataAutomationProject.Builder.create(this, id).apply(initializer).build()
