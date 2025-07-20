package com.faendir.awscdkkt.generated.services.appflow

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectorProfile(
  id: String,
  props: CfnConnectorProfileProps,
  initializer: @AwsCdkDsl CfnConnectorProfile.() -> Unit = {},
): CfnConnectorProfile = CfnConnectorProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectorProfile(id: String, initializer: @AwsCdkDsl CfnConnectorProfile.Builder.() -> Unit = {}): CfnConnectorProfile = CfnConnectorProfile.Builder.create(this, id).apply(initializer).build()
