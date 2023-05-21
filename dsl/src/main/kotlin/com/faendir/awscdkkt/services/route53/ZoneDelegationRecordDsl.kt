package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.ZoneDelegationRecord
import software.amazon.awscdk.services.route53.ZoneDelegationRecordProps
import software.constructs.Construct

@Generated
public fun Construct.zoneDelegationRecord(
  id: String,
  props: ZoneDelegationRecordProps,
  initializer: ZoneDelegationRecord.() -> Unit = {},
): ZoneDelegationRecord = ZoneDelegationRecord(this, id, props).apply(initializer)
