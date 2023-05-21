package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
import software.constructs.Construct

@Generated
public fun Construct.crossAccountZoneDelegationRecord(
  id: String,
  props: CrossAccountZoneDelegationRecordProps,
  initializer: CrossAccountZoneDelegationRecord.() -> Unit = {},
): CrossAccountZoneDelegationRecord = CrossAccountZoneDelegationRecord(this, id,
    props).apply(initializer)
