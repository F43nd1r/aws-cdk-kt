package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnActionConnector
import software.amazon.awscdk.services.quicksight.CfnActionConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnActionConnector(
  id: String,
  props: CfnActionConnectorProps,
  initializer: @AwsCdkDsl CfnActionConnector.() -> Unit = {},
): CfnActionConnector = CfnActionConnector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnActionConnector(id: String, initializer: @AwsCdkDsl CfnActionConnector.Builder.() -> Unit = {}): CfnActionConnector = CfnActionConnector.Builder.create(this, id).apply(initializer).build()
