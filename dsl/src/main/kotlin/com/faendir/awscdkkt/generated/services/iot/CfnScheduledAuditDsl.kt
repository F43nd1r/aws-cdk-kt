package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnScheduledAudit
import software.amazon.awscdk.services.iot.CfnScheduledAuditProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduledAudit(id: String, props: CfnScheduledAuditProps): CfnScheduledAudit
    = CfnScheduledAudit(this, id, props)

@Generated
public fun Construct.cfnScheduledAudit(
  id: String,
  props: CfnScheduledAuditProps,
  initializer: @AwsCdkDsl CfnScheduledAudit.() -> Unit,
): CfnScheduledAudit = CfnScheduledAudit(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScheduledAudit(id: String, initializer: @AwsCdkDsl
    CfnScheduledAudit.Builder.() -> Unit): CfnScheduledAudit =
    CfnScheduledAudit.Builder.create(this, id).apply(initializer).build()
