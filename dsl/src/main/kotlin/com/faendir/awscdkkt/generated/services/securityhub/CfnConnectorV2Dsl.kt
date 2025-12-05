package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnConnectorV2
import software.amazon.awscdk.services.securityhub.CfnConnectorV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectorV2(
  id: String,
  props: CfnConnectorV2Props,
  initializer: @AwsCdkDsl CfnConnectorV2.() -> Unit = {},
): CfnConnectorV2 = CfnConnectorV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectorV2(id: String, initializer: @AwsCdkDsl CfnConnectorV2.Builder.() -> Unit = {}): CfnConnectorV2 = CfnConnectorV2.Builder.create(this, id).apply(initializer).build()
