package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.HttpEndpoint

@Generated
public fun buildHttpEndpoint(initializer: @AwsCdkDsl HttpEndpoint.Builder.() -> Unit = {}): HttpEndpoint = HttpEndpoint.Builder.create().apply(initializer).build()
