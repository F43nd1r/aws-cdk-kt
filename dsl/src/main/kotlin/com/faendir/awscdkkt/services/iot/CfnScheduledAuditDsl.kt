package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnScheduledAudit
import software.amazon.awscdk.services.iot.CfnScheduledAuditProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduledAudit(
  id: String,
  props: CfnScheduledAuditProps,
  initializer: CfnScheduledAudit.() -> Unit = {},
): CfnScheduledAudit = CfnScheduledAudit(this, id, props).apply(initializer)
