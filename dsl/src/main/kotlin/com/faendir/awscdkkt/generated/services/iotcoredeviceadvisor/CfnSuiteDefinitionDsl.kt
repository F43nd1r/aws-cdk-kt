package com.faendir.awscdkkt.generated.services.iotcoredeviceadvisor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSuiteDefinition(
  id: String,
  props: CfnSuiteDefinitionProps,
  initializer: @AwsCdkDsl CfnSuiteDefinition.() -> Unit = {},
): CfnSuiteDefinition = CfnSuiteDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSuiteDefinition(id: String, initializer: @AwsCdkDsl
    CfnSuiteDefinition.Builder.() -> Unit = {}): CfnSuiteDefinition =
    CfnSuiteDefinition.Builder.create(this, id).apply(initializer).build()
