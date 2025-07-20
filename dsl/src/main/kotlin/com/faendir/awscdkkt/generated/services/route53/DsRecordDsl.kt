package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.DsRecord
import software.amazon.awscdk.services.route53.DsRecordProps
import software.constructs.Construct

@Generated
public fun Construct.dsRecord(
  id: String,
  props: DsRecordProps,
  initializer: @AwsCdkDsl DsRecord.() -> Unit = {},
): DsRecord = DsRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDsRecord(id: String, initializer: @AwsCdkDsl DsRecord.Builder.() -> Unit = {}): DsRecord = DsRecord.Builder.create(this, id).apply(initializer).build()
