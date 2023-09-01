package com.faendir.awscdkkt.generated.services.route53recoverycontrol

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnControlPanel(
  id: String,
  props: CfnControlPanelProps,
  initializer: @AwsCdkDsl CfnControlPanel.() -> Unit = {},
): CfnControlPanel = CfnControlPanel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnControlPanel(id: String, initializer: @AwsCdkDsl
    CfnControlPanel.Builder.() -> Unit = {}): CfnControlPanel = CfnControlPanel.Builder.create(this,
    id).apply(initializer).build()
