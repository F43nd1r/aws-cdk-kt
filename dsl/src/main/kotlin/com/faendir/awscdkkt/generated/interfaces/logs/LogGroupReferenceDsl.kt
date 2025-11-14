package com.faendir.awscdkkt.generated.interfaces.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.logs.LogGroupReference

@Generated
public fun buildLogGroupReference(initializer: @AwsCdkDsl LogGroupReference.Builder.() -> Unit = {}): LogGroupReference = LogGroupReference.Builder().apply(initializer).build()
