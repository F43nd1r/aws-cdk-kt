@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
