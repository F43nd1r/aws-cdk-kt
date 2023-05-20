@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.ZoneDelegationRecord
import software.amazon.awscdk.services.route53.ZoneDelegationRecordProps
import software.constructs.Construct

public fun Construct.zoneDelegationRecord(
  id: String,
  props: ZoneDelegationRecordProps,
  initializer: ZoneDelegationRecord.() -> Unit = {},
): ZoneDelegationRecord = ZoneDelegationRecord(this, id, props).apply(initializer)
