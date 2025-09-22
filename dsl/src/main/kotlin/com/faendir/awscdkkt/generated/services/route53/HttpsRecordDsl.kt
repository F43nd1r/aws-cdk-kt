package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.HttpsRecord
import software.amazon.awscdk.services.route53.HttpsRecordProps
import software.constructs.Construct

@Generated
public fun Construct.httpsRecord(
  id: String,
  props: HttpsRecordProps,
  initializer: @AwsCdkDsl HttpsRecord.() -> Unit = {},
): HttpsRecord = HttpsRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpsRecord(id: String, initializer: @AwsCdkDsl HttpsRecord.Builder.() -> Unit = {}): HttpsRecord = HttpsRecord.Builder.create(this, id).apply(initializer).build()
