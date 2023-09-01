package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ZoneDelegationRecord.() -> Unit = {},
): ZoneDelegationRecord = ZoneDelegationRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildZoneDelegationRecord(id: String, initializer: @AwsCdkDsl
    ZoneDelegationRecord.Builder.() -> Unit = {}): ZoneDelegationRecord =
    ZoneDelegationRecord.Builder.create(this, id).apply(initializer).build()
