package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogRetentionProps

@Generated
public fun buildLogRetentionProps(initializer: @AwsCdkDsl LogRetentionProps.Builder.() -> Unit =
    {}): LogRetentionProps = LogRetentionProps.Builder().apply(initializer).build()
