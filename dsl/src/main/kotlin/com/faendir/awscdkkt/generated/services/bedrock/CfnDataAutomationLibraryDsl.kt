package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnDataAutomationLibrary
import software.amazon.awscdk.services.bedrock.CfnDataAutomationLibraryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataAutomationLibrary(
  id: String,
  props: CfnDataAutomationLibraryProps,
  initializer: @AwsCdkDsl CfnDataAutomationLibrary.() -> Unit = {},
): CfnDataAutomationLibrary = CfnDataAutomationLibrary(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataAutomationLibrary(id: String, initializer: @AwsCdkDsl CfnDataAutomationLibrary.Builder.() -> Unit = {}): CfnDataAutomationLibrary = CfnDataAutomationLibrary.Builder.create(this, id).apply(initializer).build()
