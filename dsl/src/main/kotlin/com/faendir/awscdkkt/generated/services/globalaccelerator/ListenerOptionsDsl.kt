package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.ListenerOptions

@Generated
public fun buildListenerOptions(initializer: @AwsCdkDsl ListenerOptions.Builder.() -> Unit = {}):
    ListenerOptions = ListenerOptions.Builder().apply(initializer).build()
