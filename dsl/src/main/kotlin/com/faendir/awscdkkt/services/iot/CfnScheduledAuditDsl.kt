@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnScheduledAudit
import software.amazon.awscdk.services.iot.CfnScheduledAuditProps
import software.constructs.Construct

public fun Construct.cfnScheduledAudit(
  id: String,
  props: CfnScheduledAuditProps,
  initializer: CfnScheduledAudit.() -> Unit = {},
): CfnScheduledAudit = CfnScheduledAudit(this, id, props).apply(initializer)
