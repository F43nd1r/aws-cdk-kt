@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
import software.constructs.Construct

public fun Construct.crossAccountZoneDelegationRecord(
  id: String,
  props: CrossAccountZoneDelegationRecordProps,
  initializer: CrossAccountZoneDelegationRecord.() -> Unit = {},
): CrossAccountZoneDelegationRecord = CrossAccountZoneDelegationRecord(this, id,
    props).apply(initializer)
