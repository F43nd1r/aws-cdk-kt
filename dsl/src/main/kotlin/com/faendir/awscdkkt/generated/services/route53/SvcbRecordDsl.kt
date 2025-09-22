package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.SvcbRecord
import software.amazon.awscdk.services.route53.SvcbRecordProps
import software.constructs.Construct

@Generated
public fun Construct.svcbRecord(
  id: String,
  props: SvcbRecordProps,
  initializer: @AwsCdkDsl SvcbRecord.() -> Unit = {},
): SvcbRecord = SvcbRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSvcbRecord(id: String, initializer: @AwsCdkDsl SvcbRecord.Builder.() -> Unit = {}): SvcbRecord = SvcbRecord.Builder.create(this, id).apply(initializer).build()
