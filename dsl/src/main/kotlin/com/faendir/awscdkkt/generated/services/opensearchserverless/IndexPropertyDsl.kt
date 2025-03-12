package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnIndex

@Generated
public fun buildIndexProperty(initializer: @AwsCdkDsl CfnIndex.IndexProperty.Builder.() -> Unit =
    {}): CfnIndex.IndexProperty = CfnIndex.IndexProperty.Builder().apply(initializer).build()
