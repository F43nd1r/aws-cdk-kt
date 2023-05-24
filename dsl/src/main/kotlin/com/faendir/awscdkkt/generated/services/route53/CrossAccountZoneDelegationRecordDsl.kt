package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
import software.constructs.Construct

@Generated
public fun Construct.crossAccountZoneDelegationRecord(id: String,
    props: CrossAccountZoneDelegationRecordProps): CrossAccountZoneDelegationRecord =
    CrossAccountZoneDelegationRecord(this, id, props)

@Generated
public fun Construct.crossAccountZoneDelegationRecord(
  id: String,
  props: CrossAccountZoneDelegationRecordProps,
  initializer: @AwsCdkDsl CrossAccountZoneDelegationRecord.() -> Unit,
): CrossAccountZoneDelegationRecord = CrossAccountZoneDelegationRecord(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCrossAccountZoneDelegationRecord(id: String, initializer: @AwsCdkDsl
    CrossAccountZoneDelegationRecord.Builder.() -> Unit): CrossAccountZoneDelegationRecord =
    CrossAccountZoneDelegationRecord.Builder.create(this, id).apply(initializer).build()
