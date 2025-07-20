package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CaaRecord
import software.amazon.awscdk.services.route53.CaaRecordProps
import software.constructs.Construct

@Generated
public fun Construct.caaRecord(
  id: String,
  props: CaaRecordProps,
  initializer: @AwsCdkDsl CaaRecord.() -> Unit = {},
): CaaRecord = CaaRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCaaRecord(id: String, initializer: @AwsCdkDsl CaaRecord.Builder.() -> Unit = {}): CaaRecord = CaaRecord.Builder.create(this, id).apply(initializer).build()
