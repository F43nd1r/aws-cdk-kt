package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.ARecord
import software.amazon.awscdk.services.route53.ARecordProps
import software.constructs.Construct

@Generated
public fun Construct.aRecord(
  id: String,
  props: ARecordProps,
  initializer: @AwsCdkDsl ARecord.() -> Unit = {},
): ARecord = ARecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildARecord(id: String, initializer: @AwsCdkDsl ARecord.Builder.() -> Unit =
    {}): ARecord = ARecord.Builder.create(this, id).apply(initializer).build()
