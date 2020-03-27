package io.luna.game.plugin;

import io.luna.LunaContext;
import io.luna.event.EventListener;
import io.luna.event.EventListenerPipelineSet;
import io.luna.event.EventMatcherListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * A model representing values that will be reflectively injected into the Kotlin scripting API.
 *
 * @author lare96 <http://github.com/lare96>
 */
public final class KotlinBindings {

    /**
     * The context instance.
     */
    private final LunaContext ctx;

    /**
     * The asynchronous logger.
     */
    private final Logger logger = LogManager.getLogger();

    /**
     * A list of event listeners.
     */
    private final List<EventListener<?>> listeners = new ArrayList<>();

    /**
     * A list of event matcher listeners.
     */
    private final List<EventMatcherListener<?>> matchers = new ArrayList<>();

    /**
     * The pipeline set.
     */
    private final EventListenerPipelineSet pipelines = new EventListenerPipelineSet();

    /**
     * Creates a new {@link KotlinBindings}.
     *
     * @param ctx The context instance.
     */
    KotlinBindings(LunaContext ctx) {
        this.ctx = ctx;
    }

    /**
     * @return The context instance.
     */
    public LunaContext getCtx() {
        return ctx;
    }

    /**
     * @return The asynchronous logger.
     */
    public Logger getLogger() {
        return logger;
    }

    /**
     * @return A list of event listeners.
     */
    public List<EventListener<?>> getListeners() {
        return listeners;
    }

    /**
     * @return A list of event matcher listeners.
     */
    public List<EventMatcherListener<?>> getMatchers() {
        return matchers;
    }

    /**
     * @return The pipeline set.
     */
    public EventListenerPipelineSet getPipelines() {
        return pipelines;
    }
}