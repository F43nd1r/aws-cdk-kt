package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.TxtRecord
import software.amazon.awscdk.services.route53.TxtRecordProps
import software.constructs.Construct

@Generated
public fun Construct.txtRecord(
  id: String,
  props: TxtRecordProps,
  initializer: @AwsCdkDsl TxtRecord.() -> Unit = {},
): TxtRecord = TxtRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTxtRecord(id: String, initializer: @AwsCdkDsl TxtRecord.Builder.() -> Unit = {}): TxtRecord = TxtRecord.Builder.create(this, id).apply(initializer).build()
